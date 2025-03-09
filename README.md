# Easy Mart

Easy Mart is a comprehensive supermarket management system built with NetBeans IDE, featuring dual interfaces for administrators and sales executives.

## Project Overview
This application provides a complete solution for supermarket management with two distinct user interfaces:

### Administrator Interface
- **Stock Management**: Add, update, and delete inventory items.
- **Sales Monitoring**: View comprehensive sales reports and analytics.
- **User Access Control**: Manage user accounts and permissions.
- **Product Management**: Control product categories, pricing, and details.

### Sales Executive Interface
- **Point of Sale**: Process customer transactions efficiently.
- **Stock Checking**: Verify available inventory.
- **Receipt Generation**: Print customer receipts.

## Project Structure
```
Easy_Mart/
├── src/
│   ├── easymart/
│   │   ├── admin/
│   │   │   ├── controllers/
│   │   │   │   ├── AdminDashboardController.java
│   │   │   │   ├── InventoryController.java
│   │   │   │   ├── ReportsController.java
│   │   │   │   └── UserManagementController.java
│   │   │   └── views/
│   │   │       ├── AdminDashboard.fxml
│   │   │       ├── Inventory.fxml
│   │   │       ├── Reports.fxml
│   │   │       └── UserManagement.fxml
│   │   ├── sales/
│   │   │   ├── controllers/
│   │   │   │   ├── POSController.java
│   │   │   │   └── SalesDashboardController.java
│   │   │   └── views/
│   │   │       ├── POS.fxml
│   │   │       └── SalesDashboard.fxml
│   │   ├── common/
│   │   │   ├── controllers/
│   │   │   │   └── LoginController.java
│   │   │   ├── models/
│   │   │   │   ├── Product.java
│   │   │   │   ├── Sale.java
│   │   │   │   ├── Transaction.java
│   │   │   │   └── User.java
│   │   │   ├── services/
│   │   │   │   ├── DatabaseService.java
│   │   │   │   ├── ProductService.java
│   │   │   │   └── UserService.java
│   │   │   ├── utils/
│   │   │   │   ├── AlertUtil.java
│   │   │   │   └── ValidationUtil.java
│   │   │   └── views/
│   │   │       └── Login.fxml
│   │   └── Main.java
│   └── resources/
│       ├── css/
│       │   └── styles.css
│       ├── images/
│       │   ├── logo.png
│       │   └── icons/
│       └── reports/
│           └── templates/
├── database/
│   └── itemsList/
├── lib/
│   ├── derby.jar
│   └── derbyclient.jar
├── build.xml
├── manifest.mf
└── nbproject/
    ├── build-impl.xml
    ├── genfiles.properties
    ├── jfx-impl.xml
    ├── project.properties
    └── project.xml
```

## Technical Details

### Built With
- Java
- JavaFX (integrated in NetBeans)
- Apache Derby database
- NetBeans IDE

### System Requirements
- JDK 8 or higher
- NetBeans IDE 8.2 or higher
- Minimum 2GB RAM
- 500MB disk space

## Installation & Setup

### Clone the repository:
```
git clone https://github.com/mhtafhim/easy-mart.git
```

### Open the project in NetBeans IDE:
1. Launch NetBeans
2. Select **File > Open Project**
3. Navigate to the cloned repository and select the **Easy Mart** folder
4. Click **Open Project**

### Build the project:
1. Right-click on the project in the **Projects** panel
2. Select **Clean and Build**

### Run the application:
1. Right-click on the project in the **Projects** panel
2. Select **Run**

## Database Configuration
The application uses **Apache Derby database**. The database will be automatically created in the `itemsList` directory on first run.

## Default Login Credentials

### Administrator
- **Username**: admin
- **Password**: admin123

### Sales Executive
- **Username**: sales
- **Password**: sales123

## Development

### Build Commands
#### Using NetBeans menus:
- **Clean**: Right-click project > Clean
- **Build**: Right-click project > Build
- **Run**: Right-click project > Run

#### Using Ant commands:
```
ant clean   # Clean the build directory
ant compile # Compile the source code
ant jar     # Create executable JAR
ant run     # Run the application
```

### Custom Ant Tasks
The `build.xml` file contains several JavaFX-specific targets that can be customized:
- **pre-init**: Called before initialization of project properties
- **post-init**: Called after initialization of project properties
- **pre-compile**: Called before javac compilation
- **post-compile**: Called after javac compilation
- **pre-jfx-jar**: Called before FX SDK specific jar task
- **post-jfx-jar**: Called after FX SDK specific jar task

## Project Demo
Watch the demo video on YouTube:
[Easy Mart Demo](https://www.youtube.com/watch?v=CwBWVu9NkuQ)

