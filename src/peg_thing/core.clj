(ns peg-thing.core
  (require [clojure.set as set])
  (:gen-class))

(declare successful-move prompt-move game-over query-rows)

(defn tri*
  "generates a lazy sequence of triangular numbers"
  ([] (tri* 0 1))
  ([sum n]
   (let [new-sum (+ sum n)]
     (cons new-sum (lazy-seq (tri* new-sum (inc n)))))))
(def tri (tri*))
