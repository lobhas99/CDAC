using Microsoft.AspNetCore.Mvc;

namespace _000DemoMVC.Controllers
{
    public class AdminController : Controller
    {
        public IActionResult Display()
        {
            return View("MyView2");
        }
    }
}
