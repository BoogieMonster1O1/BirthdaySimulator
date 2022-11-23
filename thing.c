#include <stdio.h>

int main() {
    long total = 0;
    double matches = 0;
    for (int a = 0; a < 365; a++) {
        for (int b = 0; b < 365; b++) {
            for (int c = 0; c < 365; c++) {
                for (int d = 0; d < 365; d++) {
                    if (!(a == b || a == c || a == d || b == c || b == d || c == d)) {
                        matches++;
                    }
                    total++;
                    if ((total % 100000000) == 0) {
                        printf("%ld \n", total);
                    }
                }
            }
        }
    }
    printf("Percent: %f \n", matches / total);
}
