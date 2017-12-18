pipeline {
    agent {
        docker {
            image 'maven:3-alpine' 
            args '-v /home/user001/maven/settings.xml:/usr/share/maven/conf/settings.xml' 
        }
    }
    stages {
        stage('code') {
            steps {
                git 'https://github.com/HarveyHe/gdemo.git'
            }
        }
        stage('Deliver for development') {
            when {
                branch 'dev'
            }
            steps {
                echo 'dev'
                
            }
        }
        stage('Deploy for production') {
            when {
                branch 'patch-1'
            }
            steps {
                echo 'patch-1'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Test') { 
            steps {
                sh 'mvn test' 
            }
            post {
                always {
                  junit 'target/surefire-reports/*.xml'
                }
            }
        }
    }
}
