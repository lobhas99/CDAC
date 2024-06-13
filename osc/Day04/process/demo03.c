#include<stdio.h>
#include<unistd.h>
#include<sys/wait.h>
#include<sys/types.h>

int main(void)
{
	int ret, status;
	printf("Program started\n");
	ret = fork();
	if(ret == 0)
	{
		// child
		for(int i = 0 ; i < 15 ; i++)
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
			if(i==15)
			{
				wait(&status);
				printf("child exit status : %d\n", WEXITSTATUS(status));
			}
			printf("parent : i = %d\n", i);
			sleep(1);
		}
	}
	printf("Program finished\n");
	return 0;
}




