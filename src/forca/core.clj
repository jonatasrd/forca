(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu [] (print "Voce perdeu"))

(defn ganhou [] (print "Voce gamhou"))

(defn acertou-a-palavra-toda? [palavra acertos] false)

(defn jogo[vidas palavra acertos]
	(if (= vidas 0)
		(perdeu)
		(if(acertou-a-palavra-toda? palavra acertos)
			(ganhou)
			(print "Chutaaaaaa")
		)
	)

)

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(defn soma[num1 num2]
	(+ num1 num2)
)

(defn fib[x]
	(if (= x 0) 0
	(if (= x 1) 1
	(+ (fib(- x 1)) (fib (- x 2))))))