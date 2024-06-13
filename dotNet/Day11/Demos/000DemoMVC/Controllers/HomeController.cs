using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Controllers;
using Microsoft.AspNetCore.Mvc.Filters;
using Microsoft.AspNetCore.Mvc.ViewEngines;

namespace _000DemoMVC.Controllers
{
    public class HomeController : Controller
    {
        //public HomeController(IEnumerable<ISpellChecker> checkers)
        //{

        //}

        //public HomeController(ISpellChecker checker)
        //{

        //}
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            base.OnActionExecuting(context);
        }

        public override void OnActionExecuted(ActionExecutedContext context)
        {
            base.OnActionExecuted(context);
        }

       
        public IActionResult Index(int? id)
        {
            Response.WriteAsync("something");
            return View("MyView");
        }
    }

    public class MyControllerFactory : IControllerFactory
    {
        public object MyControllerFactory(ControllerContext context)
        {
            throw new NotImplementedException();
        }

        public void ReleaseController(ControllerContext context, object controller)
        {
            throw new NotImplementedException();
        }
    }
    public class RazorViewEngine : IViewEngine
    {
        public ViewEngineResult FindView(ActionContext context, string viewName, bool isMainPage)
        {
            throw new NotImplementedException();
        }

        public ViewEngineResult GetView(string? executingFilePath, string viewPath, bool isMainPage)
        {
            throw new NotImplementedException();
        }
    }

    
}

namespace _000DemoMVC.Controllers.French
{
    public class HomeController: Controller
    {
        public ViewResult Index()
        {
            return View();
        }
    }
}
