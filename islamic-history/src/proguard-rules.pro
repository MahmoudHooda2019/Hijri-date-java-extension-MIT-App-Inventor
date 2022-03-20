# Add any ProGuard configurations specific to this
# extension here.

-keep public class com.mh.islamic.history.islamichistory.IslamicHistory {
    public *;
 }
-keeppackagenames gnu.kawa**, gnu.expr**

-optimizationpasses 4
-allowaccessmodification
-mergeinterfacesaggressively

-repackageclasses 'com/mh/islamic/history/islamichistory/repack'
-flattenpackagehierarchy
-dontpreverify
