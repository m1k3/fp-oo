(def Point
  (fn [x y]
    {:x x
     :y y
     :__class_symbol__ 'Point}))

;(def x
;  (fn [this]
;    (get this :x)))

;(def x
;  (fn [this]
;    (:x this)))

(def x :x)
(def y :y)

(def class-of :__class_symbol__)

(def shift
  (fn [this xinc yinc]
    (Point (+ (x this) xinc) (+ (y this) yinc))))

(def add
  (fn [this other]
    (Point (+ (x this) (x other)) (+ (y this) (y other)))))

(def add2
  (fn [this other]
    (shift this (x other) (y other))))

(def make
  (fn [klass & args]
    (apply klass args)))


(def Triangle
     (fn [point1 point2 point3]
       {:point1 point1, :point2 point2, :point3 point3
        :__class_symbol__ 'Triangle}))


(def right-triangle (Triangle (Point 0 0)
                              (Point 0 1)
                              (Point 1 0)))

(def equal-right-triangle (Triangle (Point 0 0)
                                    (Point 0 1)
                                    (Point 1 0)))

(def different-triangle (Triangle (Point 0 0)
                                  (Point 0 10)
                                  (Point 10 0)))

(def invalid-triangle (Triangle (Point 0 0)
                                (Point 0 0)
                                (Point 10 0)))

(def equal-triangles?
  (fn [this other]
    (= this other)))

(def equal-triangles2? =)

(def valid-triangle?
  (fn [& points]
    (= (distinct points) points)))


