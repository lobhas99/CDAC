using Humanizer.Inflections;
using Microsoft.AspNetCore.Mvc.Controllers;
using Microsoft.AspNetCore.Mvc.Razor;
using Microsoft.AspNetCore.Mvc.ViewEngines;

namespace _000DemoMVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();
          
            builder.Services.AddScoped<ISpellChecker, EnglishSpellChecker>();
            builder.Services.AddScoped<ISpellChecker, HindiSpellChecker>();
            //builder.Services.AddSession();
            //builder.Services.AddAntiforgery();
            //builder.Services.AddCors();

            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
            }
            app.UseStaticFiles();

            app.UseRouting();

         
            //app.MapControllerRoute(
            //  name: "myroute",
            //  pattern: "{controller=Home}/{action=Index}/{id?}/{?name}");

            //app.MapControllerRoute(
            //name: "myroute2",
            //pattern: "{controller=Home}/{action=Index}/{id?}/{?name}/{?address}");

            app.MapControllerRoute(
             name: "default",
             pattern: "{controller=Home}/{action=Index}/{id?}");

            //app.Use((context, next) => { context.Response.WriteAsync(""); });

            app.Run();
        }
    }

    public interface ISpellChecker
    {
        void DoCheck();
    }

    public class EnglishSpellChecker:ISpellChecker
    {
        public void DoCheck() {
            Console.WriteLine("English SpellCheck done");
        }
    }

    public class HindiSpellChecker : ISpellChecker
    {
        public void DoCheck()
        {
            Console.WriteLine("Hindi SpellCheck done");
        }
    }


}