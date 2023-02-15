## Github Classroom Autograde Error Message Formatter
This repository is intended to parse the HTML raw text of the Github Classroom autograde error messages and convert them into a human-readable format, with "Actual" and "Expected" outputs layed out side-by-side.

Simply paste the error message into the file inputFile.txt and run main on AutogradeSplitter.java to see a comparison between actual and expected outputs, with a star in front of each line that has different output.

## Example output for a test class Range:
::error::The output for test Range class test did not match   * 
Expected:                                                     * Actual:
r = [0.0 to 8.0]                                                r = [0.0 to 8.0]
s = [5.0 to 15.0]                                               s = [5.0 to 15.0]
t = [10.0 to 20.0]                                              t = [10.0 to 20.0]
u = [2.0 to 5.0]                                                u = [2.0 to 5.0]
z = [0.0 to 0.0]                                                z = [0.0 to 0.0]
r.length() = 8.0                                                r.length() = 8.0
s.length() = 10.0                                               s.length() = 10.0
t.length() = 10.0                                               t.length() = 10.0
u.length() = 3.0                                                u.length() = 3.0
z.length() = 0.0                                                z.length() = 0.0
r.contains(0) = true                                            r.contains(0) = true
r.contains(5) = true                                            r.contains(5) = true
r.contains(8) = true                                            r.contains(8) = true
r.contains(9) = false                                           r.contains(9) = false
r.contains(s) = false                                           r.contains(s) = false
s.contains(r) = false                                           s.contains(r) = false
r.contains(t) = false                                           r.contains(t) = false
t.contains(r) = false                                           t.contains(r) = false
r.contains(u) = true                                            r.contains(u) = true
u.contains(r) = false                                           u.contains(r) = false
r.overlaps(s) = true                                            r.overlaps(s) = true
r.overlaps(t) = false                                         * r.overlaps(t) = true
r.overlaps(u) = true                                            r.overlaps(u) = true
r.overlaps(z) = true                                            r.overlaps(z) = true
s.overlaps(u) = true                                            s.overlaps(u) = true
r.intersection(s) = [5.0 to 8.0]                                r.intersection(s) = [5.0 to 8.0]
r.intersection(t) = [0.0 to 0.0]                              * r.intersection(t) = [10.0 to 8.0]
r.intersection(u) = [2.0 to 5.0]                                r.intersection(u) = [2.0 to 5.0]
r.intersection(z) = [0.0 to 0.0]                                r.intersection(z) = [0.0 to 0.0]
s.intersection(t) = [10.0 to 15.0]                              s.intersection(t) = [10.0 to 15.0]
s.intersection(u) = [5.0 to 5.0]                                s.intersection(u) = [5.0 to 5.0]