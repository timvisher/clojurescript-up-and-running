(ns keybord-events.core
  (:require [goog.events.KeyHandler]))

(defn log-event [event]
  (.log js/console event))

(defn keyboard-events
  []
  (goog.events/listen (goog.events.KeyHandler. js/document) goog.events.KeyHandler.EventType.KEY log-event))

(keyboard-events)
