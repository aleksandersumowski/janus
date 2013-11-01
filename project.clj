(defproject janus "0.0.2"
  :description "Consumer-driven contracts, verified both ways."
  :url "http://github.com/gga/janus"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.clojure/data.json "0.2.3"]
                 [json-path "0.3.0"]
                 [clj-http "0.7.7"]
		     [lein-idea "1.0.1"]
                 [org.clojure/core.logic "0.8.4"]
                 [org.clojure/tools.cli "0.2.4"]
                 [org.clojure/data.xml "0.0.7"]]
  :dev-dependencies [ [clj-http-fake "0.4.1"]
                     [midje "1.5.1"]
                     [lein-midje "3.1.1"]]
  :main janus)
