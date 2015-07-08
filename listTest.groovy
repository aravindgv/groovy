def list = ["java", "groovy", "javascript"]
list.each{lang->
	println lang
}

def gods = ["vishnu", "Krishna", "Rama"]
gods.each{println it}


def map = ["Java":"server", "Groovy":"server", "JavaScript":"web"]
map.each {k,v->
println k
println v
}
println map.get("Java")
println map.Java
def name = "Jai Sriram"
name.each{
	if(it == " "){
		print "_"
	}
	else{
		print it
	}
}

def range = 5..10
range.each{
	println it
}

def today = new Date()
def nextweek = today + 7
(today..nextweek).each{
	println it
}


enum DAY{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

DAY.each{
	println it
}
(DAY.Monday..DAY.Friday).each{
	println it
}
