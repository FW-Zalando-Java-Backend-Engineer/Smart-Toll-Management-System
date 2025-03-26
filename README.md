# 🚘 **Java Mini Project: Smart Toll Management System**

### 🧠 Objective:
Design a **Smart Toll System** that:
- Calculates toll fees based on vehicle type and distance
- Flags restricted or blacklisted vehicles
- Supports discount logic for frequent users

Students will implement logic using:
- ✅ `if`, `if-else`, `nested if-else`
- ✅ `switch` statements
- ✅ methods with parameters and return types
- ✅ logical and relational operators
- ✅ basic user input handling (optional)

---

## 🗂 Suggested Structure:
```
SmartTollSystem/
├── src/
│   ├── TollFeeCalculator.java
│   ├── VehicleVerifier.java
│   ├── DiscountEngine.java
├── README.md
```

---

# ✅ **Task 1: Toll Fee Calculator**
📄 *TollFeeCalculator.java*

### 🎯 Goal:
Calculate toll fee based on **vehicle type** and **distance traveled**.

---

### 🧩 Method:

```java
public static double calculateToll(String vehicleType, double distance)
```

---

### 🚦 Toll Rules:

| Vehicle Type | Base Rate (/km) |
|--------------|------------------|
| `car`        | ₹2/km            |
| `truck`      | ₹4/km            |
| `motorcycle` | ₹1/km            |

Use a `switch(vehicleType.toLowerCase())` to choose base rate.

---

### 🧪 Example:

```java
calculateToll("car", 20) → 40.0  
calculateToll("motorcycle", 15) → 15.0  
```

---

### 🔍 Challenge Add-On:
Add a rule:  
- If distance > 100 km → apply **5% extra surcharge**

---

### 🔧 Starter:

```java
public class TollFeeCalculator {

    public static double calculateToll(String vehicleType, double distance) {
        double rate = 0;

        switch (vehicleType.toLowerCase()) {
            case "car": rate = 2; break;
            case "truck": rate = 4; break;
            case "motorcycle": rate = 1; break;
            default: return -1; // invalid type
        }

        double fee = rate * distance;

        // Optional surcharge
        if (distance > 100) {
            fee += fee * 0.05;
        }

        return fee;
    }
}
```

---

# ✅ **Task 2: Vehicle Verifier**
📄 *VehicleVerifier.java*

### 🎯 Goal:
Check whether a vehicle is **allowed to enter** based on registration type.

---

### 🧩 Method:

```java
public static String verifyVehicle(String plate, boolean isBlacklisted)
```

---

### 🚫 Rules:

- If plate starts with `"TEMP"` → `"Temporary pass"`
- If blacklisted → `"Access Denied 🚫"`
- Else → `"Access Granted ✅"`

Use:
- `startsWith(...)`
- `if-else` + logical operators

---

### 🧪 Examples:

```java
verifyVehicle("TEMP9283", false) → "Temporary pass"  
verifyVehicle("DL8CAB1234", true) → "Access Denied 🚫"  
verifyVehicle("KA09BZ3321", false) → "Access Granted ✅"
```

---

### 🔧 Starter:

```java
public class VehicleVerifier {

    public static String verifyVehicle(String plate, boolean isBlacklisted) {
        if (isBlacklisted) {
            return "Access Denied 🚫";
        } else if (plate.startsWith("TEMP")) {
            return "Temporary pass";
        } else {
            return "Access Granted ✅";
        }
    }
}
```

---

# ✅ **Task 3: Discount Engine**
📄 *DiscountEngine.java*

### 🎯 Goal:
Calculate final toll after applying **membership discounts** using `if-else`, `ternary`, and math.

---

### 🧩 Method:

```java
public static double applyDiscount(double tollAmount, boolean isFrequentUser)
```

---

### 💸 Rules:

- If `isFrequentUser == true`, apply 10% discount  
- Otherwise, no discount

Use ternary operator!

---

### 🧪 Examples:

```java
applyDiscount(100.0, true) → 90.0  
applyDiscount(200.0, false) → 200.0
```

---

### 🔧 Starter:

```java
public class DiscountEngine {

    public static double applyDiscount(double tollAmount, boolean isFrequentUser) {
        return isFrequentUser ? tollAmount * 0.90 : tollAmount;
    }
}
```

---

## 🏁 **What You’ll Practice:**

| Topic                     | Applied In               |
|--------------------------|--------------------------|
| `switch-case`            | TollFeeCalculator        |
| `if-else` & `startsWith` | VehicleVerifier          |
| `ternary` & `math`       | DiscountEngine           |
| Method design            | All 3 tasks              |
| Input validation         | Bonus idea 👇            |

---

## 🧠 Bonus Idea:
Create a `Main.java` class to:
- Input plate, type, distance
- Use all 3 tasks in sequence
- Print final receipt

---

## 📚 Resources:
- [Java switch Statement – Oracle](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html)  
- [Java String methods – Oracle](https://docs.oracle.com/javase/8/docs/api/java/lang/String.html)  
- [Ternary Operator – W3Schools](https://www.w3schools.com/java/java_conditions.asp)
