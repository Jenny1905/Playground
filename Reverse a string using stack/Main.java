#include <bits/stdc++.h> 
#include<iostream>
using namespace std; 
// function to swap two character 
void swap(char *x, char *y) 
{ 
  char temp = *x; 
  *x = *y; 
  *y = temp; 
} 
// to reverse a string 
void reversestring(char str[]) 
{ 
  // get size 
  int ne = strlen(str), i; 
  for (i = 0; i < ne/2; i++) 
    swap(&str[i], &str[ne-i-1]); 
} 
int main() 
{ 
  char str[10];
  cin>>str;
  reversestring(str); 
  cout<< str; 
  return 0; 
} 
