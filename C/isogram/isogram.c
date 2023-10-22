#include "isogram.h"
#include <ctype.h>
#include <stdio.h>
#include <string.h>

bool is_isogram(const char *phrase) {
  if (phrase == NULL) {
    return 0;
  }

  if (strlen(phrase) == 0) {
    return 1;
  }

  int len = strlen(phrase);
  for (int i = 0; i < len; i++) {
    char curr = phrase[i];
    if (curr == '-' || curr == ' ') {
      continue;
    }

    curr = tolower(curr);
    for (int j = i + 1; j < len; j++) {
      if (curr == tolower(phrase[j])) {
        return 0;
      }
    }
  }

  return 1;
}