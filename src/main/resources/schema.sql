CREATE TABLE IF NOT EXISTS courses (
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `title` VARCHAR(255) NOT NULL,
  `coursecode` VARCHAR(255) NOT NULL,
  `description` TEXT
);

CREATE TABLE IF NOT EXISTS courseinstance (
  `id` INT PRIMARY KEY AUTO_INCREMENT,
  `year` INT NOT NULL,
  `semester` INT NOT NULL,
  `courseId` INT NOT NULL
);
