(ns i-am-a-horse-in-the-land-of-booleans
  (:refer-clojure :exclude [boolean]))

(defn boolean
  "Returns true for all values except nil and false."
  [x]
  (if (or (= x nil)
          (= x false))
    false
    true))

(defn abs
  "Returns absolute value of a given number."
  [n]
  (if (< n 0) (- n) n))

(defn divides?
  "Returns true if the divsior evenly divides n."
  [divisor n]
  (if (= (mod n divisor) 0)
    true
    false))

(defn fizzbuzz
  "Returns 'fizz' when n is divisible by 3, 'buzz' when n is divisible by 5, 'gotcha!' when n is divisible by 15, and '' otherwise."
  [n]
  (cond (divides? 15 n) "gotcha!"
        (divides? 5 n)  "buzz"
        (divides? 3 n)  "fizz"
        :else ""))

(defn teen?
  "Returns true for ages between 13 and 19, inclusive."
  [age]
  (<= 13 age 19))

(defn not-teen?
  "Returns false for ages between 13 and 19, inclusive."
  [age]
  (not (teen? age)))

(defn generic-doublificate
  "Doubles x if it is a number. Returns nil if x is empty collection. If x is a list or vector, returns twice its length. Otherwise returns true"
  [x]
  (cond (number? x) (* 2 x)
        (empty? x) nil
        (or (list? x) (vector? x)) (* 2 (count x))
        :else true))

(defn leap-year?
  "Returns true is year is divisible by both 100 and 400, or if year is divisible by 4 but not by 100"
  [year]
  (if (divides? 100 year)
    (divides? 400 year)
    (divides? 4 year)))

; '_______'
