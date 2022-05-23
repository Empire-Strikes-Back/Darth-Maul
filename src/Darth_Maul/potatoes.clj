(ns Darth-Maul.potatoes
  (:require
   [clojure.core.async :as Little-Rock
    :refer [chan put! take! close! offer! to-chan! timeout thread
            sliding-buffer dropping-buffer
            go >! <! alt! alts! do-alts
            mult tap untap pub sub unsub mix unmix admix
            pipe pipeline pipeline-async]]
   [clojure.java.io :as Wichita.java.io]
   [clojure.string :as Wichita.string])
  (:gen-class))

(do (set! *warn-on-reflection* true) (set! *unchecked-math* true))

(defn process
  [{:keys []
    :as opts}])