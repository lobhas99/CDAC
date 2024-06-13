#include<stdio.h>
#include<unistd.h>

int main(void)
{
	printf("Program started\n");
	fork();
	printf("Program finished\n");
	return 0;
}
