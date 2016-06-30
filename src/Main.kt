import java.io.File
import java.util.*
import kotlin.io.*

data class User (var name: String, val age: Int);  // valにすると再代入不可

fun main (args: Array<String>) {
    println("Hello, world!");
    var user = User("daiiz", 22);
    val foo: Double = 3.3;
    user.name = "daizplus";
    println(user);

    test();
    readTxt("sample.txt");
    val li = readCsv("sample.csv");
    writeTxt("gen.txt", li);
}

fun readTxt (filePath: String) {
    val src = File(filePath);
    val lines = src.readLines().filter(String::isNotBlank).toList();
    println(lines);
}

fun writeTxt (filePath: String, contents: MutableList<List<String>>) {
    val f = File(filePath);
    f.printWriter().use { out ->
        for (raw in contents) {
            val line = raw.joinToString(" & ");
            out.println(line);
        }
    }
}

fun readCsv (filePath: String): MutableList<List<String>> {
    val res: MutableList<List<String>> = ArrayList();
    val src = File(filePath);
    val lines = src.readLines().filter(String::isNotBlank).toList();
    for (line in lines) {
        var tokens = line.split(",").map { a -> a.trim() };
        res.add(tokens);
    }
    return res;
}

fun test () {
    var map: HashMap<String, String> = hashMapOf("a" to "b");
    var list: MutableList<String> = arrayListOf();
    list.add("e");
    println(list);
}
