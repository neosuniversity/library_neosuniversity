package org.neosuniversity;

import org.neosuniversity.time.NeosDateUtil;

public class Test {

    public static void main(String[] args) {
        System.out.println(NeosDateUtil.getCurrentDatePlusDays(2,"dd-MM-yyyy"));
        System.out.println(NeosDateUtil.getDateByString("dd-MM-yyyy","06-04-2019"));
        System.out.println(NeosDateUtil.getDaysBetweenDates("dd-MM-yyyy","02-04-2019","06-04-2019"));
    }
}
