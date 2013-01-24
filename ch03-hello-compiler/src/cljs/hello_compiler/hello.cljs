(ns hello-compiler.hello)

(defn ^:export main []
  (.log js/console "This is accesing the host platform, Charnock…"))