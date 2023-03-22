(ns tests.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn sum-to-target? [num1 num2 target]
  (= target (+ num1 num2)))

(defn test-on-remains [num vect target]
  (map (fn [element] (sum-to-target? num element target)) vect))

(defn twosum [numbers target]
  (loop [counter 1
         vect numbers]
     (cond
      (= (count vect) 0)
      (print "done")
      (some true? (test-on-remains (first vect) (subvec vect 1) target))
      (vector (- counter 1) (+ counter (count (take-while not (test-on-remains (first vect) (rest vect) target)))))
      :else
      (recur (inc counter) (subvec vect 1))))
)

(defn testmain []
  (+ 1 1))
