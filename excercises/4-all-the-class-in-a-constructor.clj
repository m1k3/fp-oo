(def make
  (fn [klass & args]
    (apply klass args)))

(def send-to
  (fn [object message & args]
    (apply (message (:__methods__ object)) object args)))

(def Point
  (fn [x y]
    {
     :x x
     :y y

     :__class_symbol__ 'Point
     :__methods__ {
        :x :x
        :y :y
        :class :__class_symbol__
        :shift
          (fn [this xinc yinc]
            (make Point (+ (send-to this :x) xinc) (+ (send-to this :y) yinc)))
        :add
          (fn [this other]
            (send-to this :shift (send-to other :x) (send-to other :y)))}}))

