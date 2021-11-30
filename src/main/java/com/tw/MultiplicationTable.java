package com.tw;

public class MultiplicationTable {
    public String create(int start, int end) {
        return isValid(start,end)? generateTable(start, end) : null;
    }

    public Boolean isValid(int start, int end) {
        return isInRange(start) && isInRange(end) && isStartNotBiggerThanEnd(start, end);
    }

    public Boolean isInRange(int number) {
        return number >= 1 && number <= 1000;
    }

    public Boolean isStartNotBiggerThanEnd(int start, int end) {
        return start <= end;
    }

    public String generateTable(int start, int end) {
        String output_string = "";
        for (int i = start; i <= end; i++) {
            if (i == end)
                output_string += generateLine(start, i);
            else
                output_string += generateLine(start, i) + "\r\n";
        }
        return output_string;
    }

    public String generateLine(int start, int row) {
        String output_string = "";
        for (int i = start; i <= row; i++){
            if ( i == row )
                output_string += generateSingleExpression(i, row);
            else
                output_string += generateSingleExpression(i, row) + "  ";
        }
        return output_string;
    }

    public String generateSingleExpression(int multiplicand, int multiplier) {
        return multiplicand + "*" + multiplier + "=" + multiplicand * multiplier;
    }
}
