# Mortgage Calculator

A simple web-based **Mortgage Calculator** application that calculates the final interest amount based on user inputs. Users can input details like the **Principal Amount**, **Annual Interest Rate**, and **Term (in years)**, and the application calculates and displays the interest amount as the output. 

This project uses **Spring Web** to handle the backend logic and **Thymeleaf** as the templating engine to render HTML pages.

## Features

- Input fields for **Principal Amount**, **Annual Interest Rate**, and **Loan Term** (in years)
- Calculation of the total interest amount based on user input
- Real-time display of the calculated results on a simple and intuitive web interface
- Built with **Spring Boot**, **Spring Web**, and **Thymeleaf**

## Technologies Used

- **Java**
- **Spring Boot**
- **Spring Web**
- **Thymeleaf** (Template Engine)
- **HTML/CSS** (for front-end)

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)** 11 or higher
- **Maven** (for managing dependencies)

### Installation

1. Clone the repository:

    ```bash
    git clone https://github.com/yourusername/mortgage-calculator.git
    ```

2. Navigate to the project directory:

    ```bash
    cd mortgage-calculator
    ```

3. Build the project using Maven:

    ```bash
    mvn clean install
    ```

4. Run the application:

    ```bash
    mvn spring-boot:run
    ```

5. Open your browser and navigate to `http://localhost:8080` to use the Mortgage Calculator.

## Usage

1. Enter the **Principal Amount** (e.g., $100,000).
2. Enter the **Annual Interest Rate** (e.g., 5%).
3. Enter the **Loan Term** (e.g., 15 years).
4. Click **Calculate**.
5. View the final interest amount displayed as the result.

## Project Structure

- `src/main/java` - Contains the main Java files for Spring Boot and backend logic
- `src/main/resources/templates` - Contains Thymeleaf templates for the HTML pages
- `src/main/resources/static` - Stores static assets (e.g., CSS)
- `application.properties` - Configuration file for Spring Boot

## Example Calculation

For a **Principal Amount** of $100,000, an **Annual Interest Rate** of 5%, and a **Term** of 15 years, the calculator will output the total interest payable over the loan period.

## Contributing

Contributions are welcome! If you have suggestions or improvements, please submit a pull request.

1. Fork the project
2. Create a new branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add some feature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a pull request

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Happy calculating! 😊
