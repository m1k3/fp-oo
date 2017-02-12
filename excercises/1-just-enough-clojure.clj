; Given what you know now, can you define a function second that returns the
; second element of a list?

(def second (fn [list] (first (rest list))))

; “Give two implementations of third, which returns the third element of a list”

(def third (fn [list] (first (rest (rest list)))))
(def third (fn [list] (second (rest list))))

; Implement add-squares
; (add-squares 1 2 5) => 30

 (def add-squares
   (fn [& list]
     (apply + (map * list list))))

; Using range and apply, implement a bizarre version of factorial that uses
; neither iteration nor recursion

(def factorial
  (fn [num]
    (apply * (range 1 (+ num 1)))))

(def factorial
  (fn [num]
    (apply * (range 1 (inc num)))))

; Play around with functinos

; take
(take 3 (filter even? (range 1 42)))

; distinct
(distinct [1 1 1 2 2 3 3 3 4 4 4 4])

; concat
(concat (range 1 42) (range 43 142))

; repeat
(take 42 (repeat 42))
(repeat 42 42)

; interleave
(interleave (repeat 42 42) (repeat 43 43))

; drop and drop-last
(drop 5 (range 1 42))
(drop-last 5 (range 1 42))

; flatten
; Add the elements of a sequence of elements without using `cons`
(eval (flatten [+ [1 2 3]]))

; partition only the [n coll] case like (partition 2 [1 2 3 4])
(partition 2 [1 2 3 4 5 6])

; every?
(every? even? (map * [2 4] [2 4]))

; remove and use function as the function argument
(remove (fn[x] (= x (rand-int 10))) (range 1 10))

; Excercise 6 implement prefix-of?
(def prefix-of? (fn [candidate sequence] (= (take (count candidate) sequence) candidate)))

; Excercise 7: implement tails function

(def tails
  (fn [items]
    (map
      (fn[x] (drop x items))
      (range (inc (count items))))))

; Excercise 8: what happens if
(def puzzle (fn [list] (list list)))
; boom because both `list` get substitted for the value and the first one needs
; to be a function to be the first element of a list.
