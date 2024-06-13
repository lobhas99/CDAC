namespace _000DemoMVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();

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

            app.Run();
        }
    }
}