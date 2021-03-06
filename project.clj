(defproject masai "0.6.0-alpha1"
  :description "Key-value database for Clojure with pluggable backends."
  :dependencies [[clojure "1.2.0"]
                 [useful "0.7.0-beta4"]
                 [retro "0.5.0"]]
  :dev-dependencies [[tokyocabinet "1.24.1-SNAPSHOT"]
                     [spy/memcached "2.4rc1"]
                     [org.clojars.raynes/jedis "2.0.0-SNAPSHOT"]
                     [clojure-contrib "1.2.0"]
                     [org.clojars.flatland/cake-marginalia "0.6.3"]]
  :tasks [cake-marginalia.tasks])
