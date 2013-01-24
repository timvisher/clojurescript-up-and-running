(ns keybord-events.core
  (:require [goog.events :as events]))

(defn log-event [event]
  (.log js/console event))

(defn keyboard-events
  []
  (events/KeyHandler. js/document))

(keyboard-events)
