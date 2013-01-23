(ns hello-compiler.hello)

(defn ^:export main []
  (.write js/document "<p>Ohai, Charnock!</p>"))