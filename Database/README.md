[<img src="../Buttons/SVG/back.svg" height="35" width="auto"/>](../README.md/#database)
<br>

# SQL Database Project: Karve Ski Demos
<hr>

Karve is an online ski demo subscription for enthusiasts who always want the ideal gear for current snow conditions. Members have access to hundreds of skis at the touch of a button, delivered to their doorstep, with the freedom to swap products at any time with no additional cost.

To see how I populated this database with thousands of rows of highly realistic data, simulating normal and skewed distributions for customer measures based on gender, adding seasonality for consumer behavior, simulating ski damage patterns, and much more, see [Python Projects](../PythonProjects/README.md/#top).

Here is the diagram for Karve's OLTP database.

![image](https://user-images.githubusercontent.com/90723578/136710522-a44f98dc-d7bf-4756-89f2-b80a134231af.png)

## Database Design
Description coming soon...

Here are its most important tables:

### Rental
Description coming soon...
```sql
CREATE TABLE Rental
    (RentalID           INT CONSTRAINT pk_rental PRIMARY KEY,
    CustomerID          INT CONSTRAINT fk_rental_customer FOREIGN KEY REFERENCES Customer(CustomerID),
    MountedSkiID        INT CONSTRAINT fk_rental_mounted_ski FOREIGN KEY REFERENCES MountedSki(MountedSkiID),
    OrderDate           DATE DEFAULT GETDATE() CONSTRAINT nn_rental_order_date NOT NULL
        CONSTRAINT ck_rental_order_date CHECK (OrderDate < GetDate()),
    ReturnDate          DATE DEFAULT '10000101', 
    DaysUsed            INT DEFAULT -1, 
    Tuned               BIT DEFAULT 0 
    );
```

### DamageType and Damage
Description coming soon...
```sql
CREATE TABLE DamageType
    (DamageTypeID       INT CONSTRAINT pk_damage_type PRIMARY KEY,
    DamageDescription   NVARCHAR(100) CONSTRAINT nn_damage_type_desc NOT NULL,
    Fee                 MONEY CONSTRAINT nn_damage_type_fee NOT NULL,
    SkiTotaled          BIT CONSTRAINT nn_damage_type_ski_totaled NOT NULL
    );
CREATE TABLE Damage
    (RentalID           INT CONSTRAINT nn_damage_rental_id NOT NULL,
    DamageTypeID        INT CONSTRAINT nn_damage_damage_type_id NOT NULL,
    CONSTRAINT          pk_damage PRIMARY KEY (RentalID, DamageTypeID),
    CONSTRAINT          fk_damage_rental FOREIGN KEY (RentalID) REFERENCES Rental(RentalID),
    CONSTRAINT          fk_damage_damage_type FOREIGN KEY (DamageTypeID) REFERENCES DamageType(DamageTypeID)
    );
```

### Customer
Description coming soon
```sql
CREATE TABLE Customer
    (CustomerID         INT CONSTRAINT pk_customer PRIMARY KEY,
    FirstName           NVARCHAR(30) CONSTRAINT nn_customer_first_name NOT NULL,
    LastName            NVARCHAR(30) CONSTRAINT nn_customer_last_name NOT NULL,
    Email               NVARCHAR(40) CONSTRAINT nn_customer_email NOT NULL,
    Street              NVARCHAR(50) CONSTRAINT nn_customer_street NOT NULL,
    City                NVARCHAR(50) CONSTRAINT nn_customer_city NOT NULL,
    [State]             NVARCHAR(2) CONSTRAINT fk_customer_state FOREIGN KEY REFERENCES [State](StateID),
    Zipcode             NVARCHAR(11) CONSTRAINT nn_customer_zipcode NOT NULL,
    SignupDate          DATE DEFAULT GETDATE(),
    DateOfBirth         DATE CONSTRAINT nn_customer_dob NOT NULL
        CONSTRAINT ck_customer_dob CHECK (DateOfBirth < GetDate()),
    Gender              NVARCHAR(1) CONSTRAINT nn_customer_gender NOT NULL
        CONSTRAINT ck_customer_gender CHECK (Gender IN ('m', 'f')),
    Height              INT CONSTRAINT nn_customer_height NOT NULL,
    [Weight]            INT CONSTRAINT nn_customer_weight NOT NULL,
    AbilityLevel        INT CONSTRAINT nn_customer_ability NOT NULL
        CONSTRAINT ck_customer_ability CHECK (AbilityLevel BETWEEN 1 AND 3),
    BootSize            NUMERIC(3,1)
        CONSTRAINT ck_customer_bootsize CHECK (BootSize BETWEEN 22.5 AND 32.5),
    BootSoleLength      INT CONSTRAINT nn_customer_bsl NOT NULL
        CONSTRAINT ck_customer_bsl CHECK (BootSoleLength BETWEEN 220 AND 390)
    );

```

### MountedSki
Description coming soon...
```sql
CREATE TABLE MountedSki
    (MountedSkiID       INT CONSTRAINT pk_mounted_ski PRIMARY KEY,
    BindingID           INT CONSTRAINT fk_mounted_ski_binding FOREIGN KEY REFERENCES [Binding](BindingID),
    SkiID               INT CONSTRAINT fk_mounted_ski_ski FOREIGN KEY REFERENCES Ski(SkiID),
    MountDate           DATE CONSTRAINT nn_mounted_ski_mount_date NOT NULL
        CONSTRAINT ck_mounted_ski_mount_date CHECK (MountDate < GetDate()),
    ActiveMountedSki    BIT CONSTRAINT nn_mounted_ski_active NOT NULL
        CONSTRAINT df_ski_bindging_active DEFAULT 1
    );

```

### SkiModel and Ski
Description coming soon...
```sql
CREATE TABLE SkiModel
    (SkiModelID         INT CONSTRAINT pk_ski_model PRIMARY KEY,
    SkiTypeID           INT CONSTRAINT fk_ski_model_ski_type FOREIGN KEY REFERENCES SkiType(SkiTypeID),
    BrandName           NVARCHAR(30) CONSTRAINT fk_ski_model_brand FOREIGN KEY REFERENCES Brand(BrandName),
    [Name]              NVARCHAR(50) CONSTRAINT nn_ski_model_name NOT NULL,
    WaistWidth          INT CONSTRAINT nn_ski_model_waist NOT NULL,
    ModelYear           INT,
    LengthsAvailable    NVARCHAR(200)
    );
CREATE TABLE Ski
    (SkiID              INT CONSTRAINT pk_ski PRIMARY KEY,
    SkiModelID          INT CONSTRAINT fk_ski_ski_model FOREIGN KEY REFERENCES SkiModel(SkiModelID),
    PurchaseDate        DATE CONSTRAINT ck_ski_purchase_date CHECK (PurchaseDate < GetDate()),
    [Length]            INT CONSTRAINT nn_ski_length NOT NULL
        CONSTRAINT ck_ski_length CHECK ([Length] BETWEEN 90 AND 210),
    ActiveSki           BIT CONSTRAINT nn_ski_active NOT NULL
        CONSTRAINT df_ski_active DEFAULT 1
    );

```

### BindingModel and Binding
Description coming soon...
```sql
CREATE TABLE BindingModel
    (BindingModelID     INT CONSTRAINT pk_binding_model PRIMARY KEY,
    Brand               NVARCHAR(30) CONSTRAINT fk_binding_model_brand FOREIGN KEY REFERENCES Brand(BrandName),
    [Name]              NVARCHAR(50) CONSTRAINT nn_binding_model_name NOT NULL,
    MaxDin              NUMERIC(5,1) CONSTRAINT nn_binding_model_max_din NOT NULL
        CONSTRAINT ck_binding_model_max_din CHECK (MaxDin BETWEEN 10 AND 18),
    MinDin              NUMERIC(5,1) CONSTRAINT nn_binding_model_min_din NOT NULL
        CONSTRAINT ck_binding_model_min_din CHECK (MinDin BETWEEN 2 AND 8),
    MaxBootSoleLength   INT CONSTRAINT nn_binding_model_max_bsl NOT NULL
        CONSTRAINT ck_binding_model_max_bsl CHECK (MaxBootSoleLength BETWEEN 220 AND 390),
    MinBootSoleLength   INT CONSTRAINT nn_binding_model_min_bsl NOT NULL
        CONSTRAINT ck_binding_model_min_bsl CHECK (MinBootSoleLength BETWEEN 220 AND 390),
    ModelYear           INT
    );
CREATE TABLE [Binding]
    (BindingID          INT CONSTRAINT pk_binding PRIMARY KEY,
    BindingModelID      INT CONSTRAINT fk_binding_binding_model FOREIGN KEY REFERENCES BindingModel(BindingModelID),
    PurchaseDate        DATE CONSTRAINT ck_binding_purchase_date CHECK (PurchaseDate < GetDate()),
    ActiveBinding       BIT CONSTRAINT nn_binding_active NOT NULL
        CONSTRAINT df_binding_active DEFAULT 1
    );

```

## Inventory Management Application
### A VB.NET App Built using Visual Studio

Description coming soon...

![sc_Search](https://user-images.githubusercontent.com/90723578/136711697-a1c762bb-8058-4db7-8a88-cf9d332ff8b3.png)



