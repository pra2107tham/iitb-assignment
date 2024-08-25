CREATE TABLE IF NOT EXISTS course (
    course_code BIGINT PRIMARY KEY,
    title VARCHAR(255),
    description TEXT
);
CREATE TABLE IF NOT EXISTS course_instance (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    delivery_year INT,
    semester INT,
    course_id BIGINT NOT NULL,
    FOREIGN KEY (course_id) REFERENCES course(course_code)
);
