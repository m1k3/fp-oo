; Given what you know now, can you define a function second that returns the
; second element of a list?

(def second (fn [list] (first (rest list))))

; “Give two implementations of third, which returns the third element of a list”

(def third (fn [list] (first (rest (rest list)))))
(def third (fn [list] (second (rest list))))
