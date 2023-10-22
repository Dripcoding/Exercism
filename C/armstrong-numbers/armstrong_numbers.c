#include "armstrong_numbers.h"
#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int get_digit_count(int candidate);
int calculate_armstrong_num(int candidate, int digit_count);

int get_digit_count(int candidate) {
  int count = 0;
  while (candidate > 0) {
    candidate /= 10;
    count++;
  }

  return count;
}

int calculate_armstrong_num(int candidate, int digit_count) {
  int sum = 0;

  while (candidate > 0) {
    sum += pow(candidate % 10, digit_count);
    candidate /= 10;
  }

  return sum;
}

bool is_armstrong_number(int candidate) {
  return calculate_armstrong_num(candidate, get_digit_count(candidate)) ==
         candidate;
}
