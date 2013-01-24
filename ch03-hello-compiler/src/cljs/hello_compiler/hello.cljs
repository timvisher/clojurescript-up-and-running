(ns hello-compiler.hello)

(defn ^:export main []
  (.write js/document (take 10 (iterate inc 20))))