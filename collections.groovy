def gods = ["SriRam","Vishnu","Krishna"]
for ( def i = 0 ; i < gods.size; i++) {
	def greeting = "Namskara, "
	println "$greeting" + gods[i]
} 

for (god in gods){
	def greetings = "Namskara , "
	println "$greetings" + "$god"
}
