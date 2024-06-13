namespace _04DemoCoreOOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Notepad notepad = new Notepad();
            notepad.Checker = new SpanishSpellChecker();
            notepad.SpellCheck();
        }
    }

    public class Notepad
    {
        private ISpellChecker _checker;

        public ISpellChecker Checker
        {
            set{ _checker = value; }
            get { return _checker; }
        }

        public Notepad()
        {
            this.Checker = 
                new EnglishSpellChecker();
        }
        public void SpellCheck()
        {
            Checker.SpellCheck();
        }
    }

    public interface ISpellChecker
    {
        void SpellCheck();
    }

    public class EnglishSpellChecker: ISpellChecker
    {
        public void SpellCheck()
        {
            Console.WriteLine("Spellcheck done in English");
        }
    }


    public class SpanishSpellChecker:ISpellChecker
    {
        public void SpellCheck()
        {
            Console.WriteLine("Spellcheck done in Spanish");
        }
    }

    //public sealed class A
    //{

    //}

    //public class B: A
    //{

    //}

}
