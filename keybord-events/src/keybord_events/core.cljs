(ns keybord-events.core
  (:require [goog.events :as events])
  (:import [goog.events KeyHandler]
           [goog.events.KeyHandler EventType]))

(defn log-event [event]
  (.log js/console event))

(defn keyboard-events
  []
  (events/listen (KeyHandler. js/document) EventType.KEY log-event))

(keyboard-events)
