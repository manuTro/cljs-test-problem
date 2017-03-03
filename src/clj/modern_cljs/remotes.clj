(ns modern-cljs.remotes 
  (:require [shoreleave.middleware.rpc :refer [defremote]]))

(defremote calculate [quantity price tax discount]
  (-> (* (read-string quantity) (read-string price))
      (* (+ 1 (/ (read-string tax) 100)))
      (-  (read-string discount))))


