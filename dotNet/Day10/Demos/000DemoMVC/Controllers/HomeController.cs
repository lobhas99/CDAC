using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;
using Microsoft.AspNetCore.Mvc.ViewEngines;

namespace _000DemoMVC.Controllers
{
    public class HomeController : Controller
    {
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
            return View("MyView");
        }
    }

  
}
