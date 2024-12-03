package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.IntegerRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var openCalculatorButton: Button
    private lateinit var openGreetingButton: Button
    private lateinit var openWeatherButton: Button

    /*
    data class University(
        val universityName: String,
        val departments: List<Department>
    )

    data class Department(
        val name: String,
        val professors: List<Professors>,
        val students: List<Students>
    )

    data class Professors(
        val name: String,
        val subject: String
    )

    data class Students(
        val name: String,
        val studentId: String,
        val courses: List<Courses>
    )

    data class Courses(
        val courseName: String,
        val credits: Int
    )

    //-------------------------------------------------------------------

    data class Airport(
        val airportName: String,
        val terminals: List<Terminals>
    )

    data class Terminals(
        val terminalName: String,
        val flights: List<Flights>
    )

    data class Flights(
        val flightNumber: String,
        val destination: String,
        val airline: Airline
    )

    data class Airline(
        val name: String,
        val country: String
    )

    //----------------------------------------------------------------

    data class Publisher(
        val publisherName: String,
        val authors: List<Authors>
    )

    data class Authors(
        val authorName: String,
        val books: List<Books>
    )

    data class Books(
        val title: String,
        val year: Int,
        val ratings: List<Ratings>
    )

    data class Ratings(
        val rating: Int,
        val comment: String
    )

    //-----------------------------------------------------------------

    data class Agency(
        val agencyName: String,
        val customers: List<Customers>
    )

    data class Customers(
        val customerId: String,
        val name: String,
        val email: String,
        val bookings: List<Bookings>
    )

    data class Bookings(
        val bookingId: String,
        val packages: Package,
        val rating: Rating
    )

    data class Package(
        val packageId: String,
        val destination: String,
        val durationDays: Int,
        val price: Int,
        val activities: List<Activities>
    )

    data class Activities(
        val activityName: String,
        val type: String
    )

    data class Rating(
        val score: Int,
        val comment: String
    )

    //----------------------------------------------------------------

    data class Order(
        val orderId: String,
        val customer: Customer,
        val orderItems: List<OrderItems>,
        val shipping: Shipping,
        val payment: Payment,
        val status: String
    )

    data class Customer(
        val customerId: String,
        val name: String,
        val email: String,
        val phone: String
    )

    data class OrderItems(
        val itemId: String,
        val productName: String,
        val quantity: Int,
        val pricePerUnit: Double,
        val discount: Double?
    )

    data class Shipping(
        val address: Address,
        val shippingMethod: String,
        val estimatedDeliveryDays: Int
    )

    data class Address(
        val street: String,
        val city: String,
        val postalCode: String,
        val country: String
    )

    data class Payment(
        val paymentMethod: String,
        val totalAmount: Double,
        val paid: Boolean
    )

    //---------------

    data class Project(
        val projectName: String,
        val subject: String,
        val durationWeeks: Int,
        val teamMembers: List<TeamMembers>,
        val assignments: List<Assignments>,
        val completed: Boolean
    )

    data class TeamMembers(
        val studentId: String,
        val name: String,
        val grade: Int,
        val hasCompleted: Boolean
    )

    data class Assignments(
        val assignmentName: String,
        val maxPoints: Int,
        val studentScores: StudentScores
    )

    data class StudentScores(
        val STU123: String,
        val STU124: String,
        val STU125: String
    )

    //-------------

    data class City(
        val cityName: String,
        val transitSystem: TransitSystem,
        val controlCenter: ControlCenter
    )

    data class TransitSystem(
        val buses: List<Buses>,
        val trams: List<Trams>
    )

    data class Buses(
        val routeNumber: Int,
        val routeName: String,
        val vehicles: List<Vehicles>,
        val schedule: Schedule
    )

    data class Trams(
        val routeNumber: Int,
        val routeName: String,
        val vehicles: List<Vehicles2>,
        val schedule: Schedule2
    )

    data class Vehicles(
        val vehicleId: String,
        val capacity: Int,
        val currentLocation: CurrentLocation,
        val status: String
    )

    data class CurrentLocation(
        val latitude: Double,
        val longitude: Double
    )

    data class Schedule(
        val weekday: List<Weekday>,
        val weekend: List<Weekend>
    )

    data class Weekday(
        val departureTime: String,
        val arrivalTime: String
    )

    data class Weekend(
        val departureTime: String,
        val arrivalTime: String
    )

    data class Vehicles2(
        val vehicleId: String,
        val capacity: Long,
        val currentLocation: CurrentLocation2,
        val status: String,
    )

    data class CurrentLocation2(
        val latitude: Double,
        val longitude: Double,
    )

    data class Schedule2(
        val weekday: List<Weekday2>,
        val weekend: List<Weekend2>,
    )

    data class Weekday2(
        val departureTime: String,
        val arrivalTime: String,
    )

    data class Weekend2(
        val departureTime: String,
        val arrivalTime: String,
    )

    data class ControlCenter(
        val contactNumber: String,
        val emergencyContacts: List<EmergencyContact>,
    )

    data class EmergencyContact(
        val name: String,
        val phone: String,
        val shift: String,
    )
     */


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
 //       ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
 //           val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
 //           v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
 //           insets
    //      }

        openCalculatorButton = findViewById(R.id.openCalculatorButton)
        openGreetingButton = findViewById(R.id.openGreetingButton)
        openWeatherButton = findViewById(R.id.weatherButton)

        openCalculatorButton.setOnClickListener{
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        openGreetingButton.setOnClickListener{
            val intent = Intent(this, GreetingsActivity::class.java)
            startActivity(intent)
        }
    } // ONCREATE
}
