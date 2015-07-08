def f = new File("lang.txt")
f.eachLine{lang->
	println "I know ${lang}"
}
