Write a Java Swing program to print a wave form on the output screen.Here'san example Java Swing program that prints a waveform on the output screen:

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Waveform extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PERIOD = 200;
    private static final int AMPLITUDE = 100;

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.BLACK);

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;

        for (int x = 0; x < WIDTH; x++) {
            int y = (int) (AMPLITUDE * Math.sin(2 * Math.PI * x / PERIOD));
            g.drawLine(x, centerY, x, centerY - y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Waveform");
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Waveform waveform = new Waveform();
        frame.add(waveform);

        frame.setVisible(true);
    }
}

This program
creates a
JPanel with
a paintComponent
method that
draws a
sine wave
on the
screen.The main
method creates
a JFrame, sets
its size, adds
the JPanel
to it, and
makes it
visible.

        The wave
is defined
by the
PERIOD and
AMPLITUDE constants, which
determine the
wavelength and
amplitude of
the wave.
The paintComponent
method uses
the Math.
sin function
to calculate
the y-coordinate of
each point
on the wave,
and draws
a line
from the
previous point
to the
current point.

This program
should display
a waveform
on the screen when
run.

        Write a
program to
accept rollno, name, CGPA of“n”
students and
store the
data to
a database
using JDBC
connectivity.Display the
list of
students having
CGPA greater than 7.(
Use
MySQL

import java.sql.*;

public class StudentDatabase {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/studentdb";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

            Statement stmt = conn.createStatement();

            String createTableSQL = "CREATE TABLE IF NOT EXISTS student " +
                    "(rollno INT PRIMARY KEY, " +
                    " name VARCHAR(255), " +
                    " cgpa FLOAT)";

            stmt.executeUpdate(createTableSQL);

            int n = 3; // number of students

            for (int i = 0; i < n; i++) {
                System.out.println("Enter student " + (i + 1) + " details:");

                System.out.print("Roll No: ");
                int rollno = Integer.parseInt(System.console().readLine());

                System.out.print("Name: ");
                String name = System.console().readLine();

                System.out.print("CGPA: ");
                float cgpa = Float.parseFloat(System.console().readLine());

                String insertSQL = "INSERT INTO student (rollno, name, cgpa) " +
                        "VALUES (" + rollno + ", '" + name + "', " + cgpa + ")";

                stmt.executeUpdate(insertSQL);
            }

            String selectSQL = "SELECT * FROM student WHERE cgpa > 7";

            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\nStudents with CGPA > 7:");
            while (rs.next()) {
                int rollno = rs.getInt("rollno");
                String name = rs.getString("name");
                float cgpa = rs.getFloat("cgpa");

                System.out.println("Roll No: " + rollno + ", Name: " + name + ", CGPA: " + cgpa);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }}

    This program
    first establishes
    a connection
    to a
    MySQL database
    using JDBC.
    It then
    creates a
    table called
    student with columns for rollno,name,
    and cgpa.

    The program
    prompts the
    user to
    enter details for
    n students
    and inserts
    them into
    the student
    table.After all
    students have
    been inserted, it
    selects all
    rows from
    the student
    table where
    the cgpa
    is greater than 7
    and displays
    the results.

    Note that this
    program uses
    plain text
    input from
    the console, so
    it is
    not suitable for
    production use.
    In practice, you
    would want
    to use
    a GUI
    or web

    interface to
    collect student data.Additionally,
    you would
    want to
    use prepared
    statements instead
    of plain
    SQL statements
    to avoid
    SQL injection vulnerabilities.

    public class HeapSort {
            public static void sort(int[] arr) {
                int n = arr.length;

                // Build max heap
                for (int i = n / 2 - 1; i >= 0; i--)
                    heapify(arr, n, i);

                // Extract elements one by one from heap
                for (int i = n - 1; i > 0; i--) {
                    // Move current root to end
                    int temp = arr[0];
                    arr[0] = arr[i];
                    arr[i] = temp;

                    // Call max heapify on the reduced heap
                    heapify(arr, i, 0);
                }
            }

            public static void heapify(int[] arr, int n, int i) {
                int largest = i; // Initialize largest as root
                int left = 2 * i + 1; // left = 2*i + 1
                int right = 2 * i + 2; // right = 2*i + 2

                // If left child is larger than root
                if (left < n && arr[left] > arr[largest])
                    largest = left;

                // If right child is larger than largest so far
                if (right < n && arr[right] > arr[largest])
                    largest = right;

                // If largest is not root
                if (largest != i) {
                    int swap = arr[i];
                    arr[i] = arr[largest];
                    arr[largest] = swap;

                    // Recursively heapify the affected sub-tree
                    heapify(arr, n, largest);
                }
            }

            public static void main(String[] args) {
                int[] arr = { 12, 11, 13, 5, 6, 7 };

                System.out.println("Original array:");
                printArray(arr);

                sort(arr);

                System.out.println("\nSorted array:");
                printArray(arr);
            }

            public static void printArray(int[] arr) {
                for (int i = 0; i < arr.length; i++)
                    System.out.print(arr[i] + " ");
                System.out.println();
            }
}

This program
defines a
sort method that implements
the Heap
sort algorithm
on an
input array
of integers.
It first
builds a
max heap
from the
input array, then
extracts the
maximum element
from the
heap and
swaps it
with the
last element
in the
array.It repeats this
process until
the array
is sorted.

The program
also defines
a heapify
method that
recursively reorders
the elements
of a
heap so
that the
largest element
is at
the root.

In the
main method, the
program creates
an example array,
prints the
original array, sorts
it using
the sort method,
and prints
the sorted array
.