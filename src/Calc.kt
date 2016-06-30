import Jama.*

fun main2 () {
    var dim = 3;
    var len = 10;

    var e = doubleArrayOf(1.0, 2.0, 3.0);
    var f = doubleArrayOf(4.0, 5.0, 6.0);
    var g = doubleArrayOf(7.0, 8.0, 10.0);
    var array = arrayOf(e, f, g);

    var a = Array<Double>(10, {0.0}); // 0.0が10個
    var c = Array<Array<Double>>(len, {Array<Double>(dim, {1.0})});

    var A: Matrix = Matrix(array);
    var b: Matrix = Matrix.random(3, 1);
    var x: Matrix = A.solve(b);  // Ax = b

    for (i in 0..(x.rowDimension - 1)) {
        for (j in 0..(x.columnDimension - 1)) {
            println(x.get(i, j));
        }
    }



    for (i in 0..(array.size - 1)) {
        for (j in 0..(dim - 1)) {
            println(array[i][j])
        }
        println("----")
    }
}

