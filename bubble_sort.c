/**
*		File:				bubble_sort.c
*		Project:		Algorithms
* 	Date:				05/01/23
**/

#include <stdio.h>

// Sort the sequence of numbers from smallest to largest O(n^2)
void sort(int nums[], int n){
	for(int i = 0; i <  n; i++){
			for(int j = i + 1; j < n; j++){
				if(nums[i] > nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
	}
}

// Display the sorted sequence
void display_array(int nums[], int n){
	for(int i = 0; i < n; i++){
		printf("%d", nums[i]);
	}
}

// Main entry point of the program
int main(){
	printf("ehllp");
	int numbers[] = {5,2,3,4,1};
	sort(numbers, sizeof(numbers) / sizeof(int));
	display_array(numbers,  sizeof(numbers) / sizeof(int));
	return 0;
}


