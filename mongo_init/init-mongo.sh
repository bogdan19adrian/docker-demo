set -e

mongo <<EOF
use $MONGO_INITDB_DATABASE

db.createUser({
  user: '$MONGO_DB_USERNAME',
  pwd: '$MONGO_DB_USERNAME',
  roles: [{
    role: 'readWrite',
    db: '$MONGO_INITDB_DATABASE'
  }]
})
EOF