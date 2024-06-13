#include<stdio.h>
#include<unistd.h>

int main(void)
{
	int ret;
	printf("Program started\n");
	ret = fork();
	if(ret == 0)
	{
		// child
		for(int i = 0 ; i < 30 ; i++)
		{
			printf("child : i = %d\n", i);
			sleep(1);
		}
	}
	else
	{
		// parent
		for(int i = 0 ; i < 30 ; i++)
		{
			printf("parent : i = %d\n", i);
			sleep(1);
		}
	}
	printf("Program finished\n");
	return 0;
}




