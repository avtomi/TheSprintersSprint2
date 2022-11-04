pipeline {
 agent any
 tools {
  maven 'M3'
 }
  stages {   
    stage('Checkout') {
        steps {
            git url: 'https://github.com/avtomi/TheSprintersSprint2.git',
                branch: 'main'
        }
    }
    stage('Test') {
      steps {
            sh "mvn clean test"

      }
    }
    stage('Build') {
      steps {
        sh "docker build -t coordsgameimg ."
      }
    }
    stage('Deploy') {
      steps {
        sh "echo 'Deploying'"
      }
    }
  }
}
