** Lab 8  **
---------

1. Report the results in the written part (Answers.md).
the=33258

of=18002

and=12832

a=12438

to=12429

in=9374

was=7785

that=6591

he=6202

his=5529

2. It does not make a difference if you run the program using `TreeMap` as opposed to `HashMap`.

3. I would think that if many iterators call the same instance of `WordCounter` then they would all be added to the same
set of maps and all the top words would be from across all the iterators.

4. It enables the Scanner to read each word individually. This makes `WordCounter` testable as it then able to check for
keys and thereby add to values.