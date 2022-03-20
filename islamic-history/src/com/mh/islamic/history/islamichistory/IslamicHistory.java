package com.mh.islamic.history.islamichistory;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;


import org.joda.time.Chronology;
import org.joda.time.LocalDate;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.IslamicChronology;

public class IslamicHistory extends AndroidNonvisibleComponent {

  public IslamicHistory(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction(description = "converting gregorian to hijri date")
  public String TodayHijri(int year,int month,int day) {

    Chronology iso = ISOChronology.getInstanceUTC();
    Chronology hijri = IslamicChronology.getInstanceUTC();

    LocalDate todayIso = new LocalDate(year,month,day,iso);
    LocalDate todayHijri = new LocalDate(todayIso.toDateTimeAtStartOfDay(),hijri);

    return todayHijri.toString();
  }
}
