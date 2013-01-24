(ns keybord-events.core
  (:require [goog.events.KeyHandler :as key-handler]))

(defn log-event [event]
  (.log js/console event))

(defn keyboard-events
  []
  ;; NB: Not sure what good the `:as` up there is doing for me…
  (goog.events.KeyHandler. js/document))

(keyboard-events)
